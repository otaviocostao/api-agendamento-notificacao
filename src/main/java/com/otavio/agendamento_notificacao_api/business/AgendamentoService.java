package com.otavio.agendamento_notificacao_api.business;

import com.otavio.agendamento_notificacao_api.business.mapper.IAgendamentoMapper;
import com.otavio.agendamento_notificacao_api.controller.dto.in.AgendamentoRecord;
import com.otavio.agendamento_notificacao_api.controller.dto.out.AgendamentoRecordOut;
import com.otavio.agendamento_notificacao_api.infrastructure.repositories.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AgendamentoService {

    private final AgendamentoRepository repository;

    private final IAgendamentoMapper agendamentoMapper;

    public AgendamentoRecordOut gravarAgendamento(AgendamentoRecord agendamentoRecord){
        return agendamentoMapper.paraOut(
            repository.save(agendamentoMapper.paraEntity(agendamentoRecord))
        );
    }
}
