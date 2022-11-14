package lotto.domain;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class NumberGeneratorTest {


    @Test
    void 여섯자리_랜덤_테스트(){
        NumberGenerator numberGenerator = new NumberGenerator();
        List<Integer> number = numberGenerator.createLottoNumber();
        assertThat(number.size()).isEqualTo(6);
    }

    @Test
    void 겹치는가_테스트(){
        NumberGenerator numberGenerator = new NumberGenerator();
        List<Integer> numbers = numberGenerator.createLottoNumber();
        List<Integer> result = new ArrayList<>();
        for (int number : numbers){
            // 겹치지 않는다면 추가한다.
            if (!result.contains(number)){
                result.add(number);
            }
        }
        assertThat(numbers).isEqualTo(result);
    }

}
