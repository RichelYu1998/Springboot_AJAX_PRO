package cn.tedu;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.ZoneId;
import java.util.Set;

@SpringBootTest
public class TestTimeZone {
    @Test
    void TestTimeZone() {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
    }
}
