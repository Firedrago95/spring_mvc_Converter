package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ConverterTest {

    @Test
    void stringToInteger() {
        StringToIntegerConverter converter = new StringToIntegerConverter();
        Integer result = converter.convert("1000");
        assertThat(result).isEqualTo(1000);
    }

    @Test
    void IntegerToStringTest() {
        IntegerToStringConverter converter = new IntegerToStringConverter();
        String result = converter.convert(1000);
        assertThat(result).isEqualTo("1000");
    }

    @Test
    void StringToIpPort() {
        StringToIpPortConverter converter = new StringToIpPortConverter();
        IpPort result = converter.convert("127.0.0.1:8080");
        assertThat(result).isEqualTo(new IpPort("127.0.0.1", 8080));
    }

    @Test
    void IpPortToString() {
        IpPortToStringConverter converter = new IpPortToStringConverter();
        String result = converter.convert(new IpPort("127.0.0.1", 8080));
        assertThat(result).isEqualTo("127.0.0.1:8080");
    }
}
