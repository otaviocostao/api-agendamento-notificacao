package com.otavio.agendamento_notificacao_api.business.mapper;

import com.otavio.agendamento_notificacao_api.controller.dto.in.AgendamentoRecord;
import com.otavio.agendamento_notificacao_api.controller.dto.out.AgendamentoRecordOut;
import com.otavio.agendamento_notificacao_api.infrastructure.entities.Agendamento;
import org.mapstruct.Mapper;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface IAgendamentoMapper {

    Agendamento paraEntity(AgendamentoRecord agendamentoRecord);

    AgendamentoRecordOut paraOut(Agendamento agendamento);

}
