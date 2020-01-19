# Linux_Guide
## How Linux Works
### The Linux Philosophy / Linux Way
리눅스의 원칙을 이해하는 것은 시스템 전체를 이해하는데 큰 도움을 준다. 
- Use programs that do only one task, but do it well. / 프로그램은 단 '하나'의 일을 '잘' 수행해야 한다.
- To accomplish complex tasks, use several programs linked together. / 복잡한 일을 수행하기위해, 여러가지 프로그램들을 하나로 묶어라
- Store information in human-readable plain text files whenever it is possible. / 언제나 정보를 사람이 읽을 수 있는 방식으로 저장하라.
- There is no "one true way" to do anything. / 무엇을 하던가에 하나의 절대적으로 옳은 방법이란 존재하지 않는다.
- Prefer commandline tools over graphical tools. / GUI 보다 CLI를 지향해라
- 객체 지향과 비슷한 부분도 있고, 현재 어떠한 프로그래밍, 설계를 할때마다 중요하게 여겨지는 원칙들이라고 생각된다.
- 이러한 원칙들에 따라 리눅스는 대체가능한 작은 component들로 구성되었다.
- 중요한 component들
  - boot loader
  - kernel
  - shell
  - X window server
  - window manager and desktop environment
 - file system in Linex
 - Security of a computer running Linux
 
### Core components of a Linex system
#### Boot Loader
> 시스템에서 가장 먼저 실행되는 부분이다. 만약 하나의 operating system이 설치되어 있다면, Boot loader는 kernel만을 load한다. 
만약에 다양한 operating system이나, 다양한 버전의 Linux kernel이 설치되어 있다면, Boot loader가 당신에게 선택을 하게한다. 가장 
널리 쓰이는 Boot Loader는 GRUB(GRand Unified Bootloader) 와 Lilo(Linux LOader)이다. 대부분의 유저들은 boot loader에 대해서 신경쓸 필요가 없다.
왜냐하면 Boot loader는 자동으로 설치되고 설정되기 때문이다. boot Loader은 Linux Kernel이 필요로 하는 boot sequence(
Kernel 과 메모리에대한 early boot process에 필요로 하는 device driver들을 load하고 kernel을 실행한다. )
를 생성한다. initramfs

#### Kernel
