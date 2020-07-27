# Makefile 
# Akhil Boddu

# A simple Makefile
# HelloWorld.class: HelloWorld.java
# javac HelloWorld.java

SRCDIR = src
BINDIR = bin
DOCDIR = doc
TESTDIR = test

JUNIT = ../junit/junit-4.12.jar -sourcepath ./src ./src/$*.java

JAVAC = javac
JFLAGS = -g -d $(BINDIR) -cp $(BINDIR)

#to check the src and test folders for the .java files
#also to ensure that class files are in bin 
vpath %.java $(SRCDIR):$(TESTDIR)
vpath %.class $(BINDIR)

.SUFFIXES: .java .class

.java.class:
	$(JAVAC) $(JFLAGS) $<

classes: StackArray.class JavaStack.class

default: $(CLASSES)

doc:
	javadoc -d $(DOCDIR) -cp $(DOCDIR) $(SRCDIR)/*.java

test_classes: StackArray.class JavaStack.class
	      
junit: test_classes
	
StackArray.class: StackArray.java
	javac -d $(BINDIR) -cp $(JUNIT)
JavaStack.class: JavaStack.java
	javac -d $(BINDIR) -cp $(JUNIT)


#test_classes: SearchItLinearTest.java eDirectoryTest.java #SearchItTest.java PrintItTest.java
	      
#junit: test_classes
#	javac -d $(BINDIR) -cp ../junit/junit-4.12.jar -sourcepath ./src $*.java
#	#java -cp $(BINDIR):$(JUNIT) org.junit.runner.JUnitCore $*.java	

clean:
	rm -f  $(BINDIR)/*.class
	rm -Rf doc
