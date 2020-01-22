# TDD-Study

Study with Test-Driven Development: By Example, Kent Beck

## The rhythm of TDD

1. Quickly add a test.
2. Run all tests and verify that the new addition fails
3. Make some changes to the code
4. Run all tests and verify that all succeed
5. Refactor to eliminate duplication

## To-dos

- [ ] $5 + 10CHF = $10(환율이 2:1인 경우)
- [x] $5 * 2 = $10
- [x] amount를 private으로 만들기
- [x] Dollar 부작용
- [ ] Money 반올림
- [x] equals
- [ ] 5CHF * 2 = 10CHF
- [ ] hashCode()
- [ ] Equal null
- [ ] Equal object
- [x] 5CHF * 2 = 10CHF
- [x] Dollar/Franc 중복
- [x] 공용 equals
- [x] 공용 times
- [x] Franc과 Dollar 비교하기
- [x] 통화?
- [x] testFrancMultiplication 제거

## Learned

- all the kotlin files must be located in src directory
- 어떻게 설계해야 할지 명백하지 않으면 가짜 구현을 하고 리팩토링하는 식으로 접근하라
- 핵심이 되는 객체가 다른 부분에 대해서 될 수 있는 한 모르도록 노력한다. 그렇게 하면 핵심 객체가 가능한 오랫 동안 유연할 수 있다. (게다가 테스트하기에 쉬울 뿐 아니라, 재활용하거나 이해하기에 모두 쉬운 상태로 남아 있을 수 있다.)
