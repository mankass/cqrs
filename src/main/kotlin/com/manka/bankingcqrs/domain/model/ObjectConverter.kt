package com.manka.bankingcqrs.domain.model

import com.fasterxml.jackson.databind.ObjectMapper
import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter

@Converter
class ObjectConverter : AttributeConverter<Any, String> {

    override fun convertToDatabaseColumn(p0: Any?): String {
        val objMapper = ObjectMapper();
        return objMapper.writeValueAsString(p0)
    }

    override fun convertToEntityAttribute(p0: String?): Any {
        val objMapper = ObjectMapper();
        return objMapper.convertValue(p0, Any::class.java)
    }
}