package racingcar.view;

public enum Message {
    INPUT_CAR_NAME("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    INPUT_ATTEMPTS("시도할 회수는 몇회인가요?"),
    RESULT("실행 결과"),
    WINNER("최종 우승자 : "),
    LENGTH_EXCEPTION("ERROR: 1글자 이상 5글자 이하의 이름을 입력하세요"),
    DUPLICATE_EXCEPTION("ERROR: 중복되지 않는 이름을 입력하세요"),
    INVALID_INPUT_EXCEPTION("ERROR: 허용되지 않은 입력입니다"),
    EMPTY_REPETITION_EXCEPTION("ERROR: 시도할 횟수를 반드시 입력해야 합니다"),
    INVALID_REPETITION_EXCEPTION("ERROR: 잘못된 횟수 입력입니다");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
