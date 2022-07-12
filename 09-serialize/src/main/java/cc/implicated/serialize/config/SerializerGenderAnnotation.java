package cc.implicated.serialize.config;

import cc.implicated.serialize.annotation.Gender;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Objects;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 5/16/22 14:16
 */
@Slf4j
public class SerializerGenderAnnotation extends JsonSerializer<String> implements ContextualSerializer {
    @Override
    public void serialize(String value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        log.info(serializers.get);
        if ("1".equals(value)) {
            gen.writeString("man");
        } else {
            gen.writeString("woman");
        }
    }

    @Override
    public JsonSerializer<?> createContextual(SerializerProvider prov, BeanProperty property) throws JsonMappingException {
        log.info(property.getName());
        if (Objects.equals(property.getType().getRawClass(), String.class)) {
            Annotation annotation = property.getAnnotation(Gender.class);
            Gender gender = property.getAnnotation(Gender.class);
            Gender contextAnnotation = property.getContextAnnotation(Gender.class);
        }
        return this;
    }
}
