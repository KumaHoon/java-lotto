# 로또 게임
- - -
```
 1 ~ 45 범위의 무작위 숫자 6개를 맞추는 게임.   
```
## 기능 목록

- [ ] 중복되지 않는 로또 번호 1~45 까지의 범위의 숫자 6개와 보너스 숫자 1개를 생성한다. - NumberGenerator#createRandomNumber()
- [ ] 로또 구입 금액을 물어본다. - User#payMoney()
- [ ] 구입 금액에 해당하는 만큼 로또 갯수를 구한다. Calculator#calculateLottoCount()
  - [ ] 구입 금액이 1,000원 단위인지 검증한다. Validator#isThousandUnit()
- [ ] 구입한 로또 개수를 가져온다. - User#getLottoChance()
- [ ] 유저에게 6개의 숫자를 물어본다. - User#takeLotteryNumber()
  - [ ] 유저의 숫자가 6개인지 확인한다. - Validator#checkSixNumber()
  - [ ] 유저의 숫자가 중복되지 않은지 확인한다. - Validator#checkNoDuplication()
- [ ] 당첨 번호와 유저의 숫자를 비교한다. - Comparator#compare()
  - [ ] 소숫점 둘째 자리에서 반올림한다. Round#roundToTwoDecimalPlaces()
  - [ ] 비교한 숫자에 따라 등수를 정한다. - Rank#getRank()
- [ ] 발행한 로또 수량을 출력한다. - Printer#printLottoCount()
- [ ] 발행한 로또 번호를 출력한다. - Printer#printLottoNumber()
- [ ] 당첨 내역을 출력한다. Printer#printWinPrice()
- [ ] 당첨 금액을 구한다. Calculator#calculateWinPrice()
- [ ] 당첨금을 로또 구매 금액으로 나누어 100을 곱하여 총 수익률을 출력한다. Printer#printRateOfReturn()


## 기능 요구 사항
로또 게임 기능을 구현해야 한다. 로또 게임은 아래와 같은 규칙으로 진행된다.

    - 로또 번호의 숫자 범위는 1~45까지이다.
    - 1개의 로또를 발행할 때 중복되지 않는 6개의 숫자를 뽑는다.
    - 당첨 번호 추첨 시 중복되지 않는 숫자 6개와 보너스 번호 1개를 뽑는다.
    - 당첨은 1등부터 5등까지 있다. 당첨 기준과 금액은 아래와 같다.
        - 1등: 6개 번호 일치 / 2,000,000,000원
        - 2등: 5개 번호 + 보너스 번호 일치 / 30,000,000원
        - 3등: 5개 번호 일치 / 1,500,000원
        - 4등: 4개 번호 일치 / 50,000원
        - 5등: 3개 번호 일치 / 5,000원

- 로또 구입 금액을 입력하면 구입 금액에 해당하는 만큼 로또를 발행해야 한다. 로또 1장의 가격은 1,000원이다.
- 당첨 번호와 보너스 번호를 입력받는다.
- 사용자가 구매한 로또 번호와 당첨 번호를 비교하여 당첨 내역 및 수익률을 출력하고 로또 게임을 종료한다.
- 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException를 발생시키고, "[ERROR]"로 시작하는 에러 메시지를 출력 후 종료한다.
