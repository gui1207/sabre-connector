package org.mule.modules.sabre.client;

import javax.ws.rs.ext.ContextResolver;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperProvider implements ContextResolver<ObjectMapper> {
    
    private static final ObjectMapper OBJECT_MAPPER;
    
    static {
        OBJECT_MAPPER = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }    
    
    @Override
    public ObjectMapper getContext(Class<?> type) {        
        return OBJECT_MAPPER;
    }
    
    public static ObjectMapper getObjectMapper() {
        return OBJECT_MAPPER;
    }   

}
