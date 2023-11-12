package Homework.RobotService;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RobotServiceTest {
    @InjectMocks
    private RobotService robotService;

    @Mock
    private CleaningUseCase cleaningUseCase;

    @Test
    public void testStartCleaning() {
        int robotId = 1;
        Mockito.when(cleaningUseCase.startCleaning(robotId)).thenReturn(true);
        robotService.startCleaning(robotId);
        Mockito.verify(cleaningUseCase, Mockito.times(1)).startCleaning(robotId);
    }
}
