## Abstract Syntax Notation One (ASN.1)
### What is?
- 구조화된 데이터를 직렬화(Serilazation) 하는 방식이다.
> Abstract Syntax Notation One (ASN.1) is a standard interface description language for defining data 
structures that can be serialized and deserialized in a cross-platform way. 
It is broadly used in telecommunications and computer networking, and especially in cryptography. 
- 여러가지 컴퓨터 언어들의 자료구조를 서로 이해 가능한 방식으로, serialize 하고 deserialize 하기위한 interface.  
> Protocol developers define data structures in ASN.1 modules, which are generally a section of a broader 
standards document written in the ASN.1 language. The advantage is that the ASN.1 description of the data \
encoding is independent of a particular computer or programming language (other than ASN.1.) 
> Because ASN.1 is both human-readable and machine-readable, an ASN.1 compiler can compile modules into libraries of code, 
CODECs, that decode or encode the data structures. Some ASN.1 compilers can produce code to encode or decode several 
encodings, e.g. packed, BER or XML. 
## Comparison with
- XML
- JSON
- Google protocol buffer
   - ASN.1을 사용한 data 암호화는 은 통신 시스템을 사용하는 모든 사람들에게 사용 되어 지고 있다.
   - Google protocol buffer와 비슷한 컨셉을 기반으로 한다. 
    - IDL을 사용하여 format을 묘사하고, compiler을 사용하여 target language에 대한 필요한 코드를 작성한다.
    - Google protocol buffer와 ASN.1의 주요한 차이점은, ASN.1은 다수의 encoding을 지원하여 목적에 따라 서로 다른 인코딩을 사용할수 있다는 것이다.
     - ex) CER , PER, XER
- Thrift 
  - 페이스북이 만들었다. 
- 어떻게 하면 내 시스템에 맞는 것을 고를 수 있을까?? 
  - 각각 IDL에 대한 prototype을 구성하고 실제 데이터를 넣어본다.


## related notions
- reflection
 - reflection이 지원되는 언어에서는 ASN.1같은 것을 사용할 필요가 없다.
- Google protocol buffer
 - 둘이 
- IDL (Interface description language
  -  specification language used to describe a software component's application programming interface (API).
  > specification language : A specification language is a formal language in computer science used during systems analysis, 
  requirements analysis, and systems design to describe a system at a much higher level than a programming language,
  which is used to produce the executable code for a system. 
- Serialization : data structure, object를 서로 다른 컴퓨터 환경에 저장(파일, 메모리 버퍼, 네트워크 전송)하고 나중에 재구성할 수 있는 
포맷으로 변환하는 과정이다. 
