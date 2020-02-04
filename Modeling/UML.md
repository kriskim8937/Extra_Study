## UML

### UML diagram types
- Class diagram
- Package diagram
- Profile diagram
  - Profile diagram은 metamodel level(M2)에서 작동하며, stereotype을 보여준다. 

### Extensibility Mechanisms
- Streotypes
  - Stereotype은 profile class의 하나로, metaclass가 profile의 부분으로써 어떻게 extended되는지 정의한다.
  - Stereotype은 스스로 혼자만 쓰일 수 없고, 반드시 metaclass중 하나를 extend해야한다. 
  - Stereotype은 다른 sereotype에 의해 extend 될 수 없다. 
  - Stereotype의 definition을 보여주기위해 Profile diagram이 쓰인다. 
- Tagged Values
- Constraints


### Metamodeling
> Object Management Group (OMG)에서 UML을 정의 하기 위한 metamodeling architecture을 개발하였다. MOF(Meta-Object Facility)는 4layer의 구조로
되어 있다. 맨 위의 계층은 M3 layer라고 불리는 meta-meta model이다. M3 모델은 Meta-Object Facility에 의해서 M2 model (meta-model)
를 만들기 위한 언어이다. 

## reference
- https://en.wikipedia.org/wiki/Unified_Modeling_Language
