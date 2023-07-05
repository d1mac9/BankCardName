package bankcard;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class AccountTest {
    static Stream<Arguments> testData() {
        return Stream.of(
                arguments("Иванов Петр", true),
                arguments("АБ", false),
                arguments("А Б", true),
                arguments("Очень Длинноеимясими", false),
                arguments("Очень Длинноеимясим", true),
                arguments("Иванов  Иван", false),
                arguments("ИвановИван", false),
                arguments(" ИвановИван", false),
                arguments("ИвановИван ", false),
                arguments("", false),
                arguments(" ", false)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void checkNameTest(String name, boolean isEmbossed){
        Account acc = new Account(name);
        assertEquals(isEmbossed, acc.checkNameToEmboss());
    }

}