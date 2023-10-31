package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.view.Constants;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {

    // 공백 제거
    public static String trim(String carNames) {
        Pattern trimPattern = Pattern.compile(Constants.SPACE_REGEX.getValue());
        Matcher matcher = trimPattern.matcher(carNames);
        return matcher.replaceAll("");
    }

    // 배열에 이름 담기
    public static List<String> toList(String carNames) {
        String[] names = trim(carNames).split(",");
        return Arrays.asList(names);
    }

    // 1에서 9사이의 랜덤 숫자 뽑기
    public static int getRandomNumber() {
        return Randoms.pickNumberInRange(1, 9);
    }

    // 중복된 요소의 개수를 구하기
    public static long countDuplicate(List<String> namelist) {
        return namelist.stream()
                .filter(name -> Collections.frequency(namelist, name) > 1)
                .count();
    }
}
