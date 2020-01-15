## Why Window program doesn't compatible on Linux?

>  Linux is an Unix-like system. What? Unix-like? Unix is an ancient operating system born in the 60's, when computers were huge and men were men, writing their own hardware drivers. Unix had a singular file system scheme and an amazing set of utilities. Unix-like systems are the ones that follow these characteristics. Nowadays Unix is extinct, but its soul is held in lots of Unix-like systems, such as the BSD's, Apple's Mac OSX, Minix and Linux. We can say most of the existing OSs today are either Windows ""NT based or Unix-like"".

> Windows systems need file extensions to handle their files. They simply do not know what to do with a file without an extension. Those include .exe (binaries/executables), .txt (text), .bat (batch scripts), among lots of others.

> Most Unix-like systems do not need any file extensions. Instead of relying on the filename, there is a thing called ""MIME"" (Multipurpose Internet Mail Extension). It's basically a bit of code written directly in the beginning of every file. It tells the system how to handle it. However we do use extensions sometimes just to tell the user if a file is, e.g., either a shell script (.sh) or a text file (.txt), even though it's not necessary.

> There is a thing called kernel. A kernel is a piece of software which makes the "translation" from software language to hardware language and vice-versa. It's essential to any Operating System: no kernel, no OS. Windows uses the NT kernel, while Ubuntu uses the Linux kernel (that's why it's a Linux distribution). When a developer makes a program he uses a programming language, and this language must be translated to binary (computer language) before this program can run. This process is called "compiling". But each kernel has its own way of translating a program to computer language, so programs compiled for NT can't run natively on Linux, and vice -versa.

> There is a very popular program for Unix-like Operating Systems called "Wine". Wine creates a compatibility layer so these OSs can run Windows programs. What Wine does is translating the program's requests to Linux language. You can install it in Ubuntu through the Software Center or through command line with the command sudo apt-get install wine. Right-click the .exe file you want to run and click "open with Wine". Note that some applications may not work.

> And last, but not less important (actually the most important one), there are ALWAYS free, open-source, native alternatives and solutions for Windows programs in Linux. Don't forget that!!!

P.S.: sorry for so much "language" and "translation" examples, it's the best way I found to explain.
