# Makefile 
# Akhil Boddu

# A simple Makefile
# HelloWorld.class: HelloWorld.java
# javac HelloWorld.java

SRCDIR = src
BINDIR = bin
DOCDIR = doc
TESTDIR = test

JUNIT = ../junit/junit-4.12.jar -sourcepath ./src ./test/$*.java

JAVAC = javac
JFLAGS = -g -d $(BINDIR) -cp $(BINDIR)

#to check the src and test folders for the .java files
#also to ensure that class files are in bin 
vpath %.java $(SRCDIR):$(TESTDIR)
vpath %.class $(BINDIR)

.SUFFIXES: .java .class

.java.class:
	$(JAVAC) $(JFLAGS) $<

classes: BinaryTreeNode.class BinaryTree.class BinarySearchTree.class \
     	 QueryGenerator.class eDirectory.class PrintIt.class \
     	 SearchIt.class SearchItLinear.class \

default: $(CLASSES)

doc:
	javadoc -d $(DOCDIR) -cp $(DOCDIR) $(SRCDIR)/*.java

test_classes: SearchItLinearTest.class eDirectoryTest.class SearchItTest.class PrintItTest.class
	      
junit: test_classes
	
SearchItLinearTest.class: SearchItLinearTest.java
	javac -d $(BINDIR) -cp $(JUNIT)
eDirectoryTest.class: eDirectoryTest.java
	javac -d $(BINDIR) -cp $(JUNIT)
PrintItTest.class: PrintItTest.java
	javac -d $(BINDIR) -cp $(JUNIT)
SearchItTest.class: SearchItTest.java
	javac -d $(BINDIR) -cp $(JUNIT)

#test_classes: SearchItLinearTest.java eDirectoryTest.java #SearchItTest.java PrintItTest.java
	      
#junit: test_classes
#	javac -d $(BINDIR) -cp ../junit/junit-4.12.jar -sourcepath ./src $*.java
#	#java -cp $(BINDIR):$(JUNIT) org.junit.runner.JUnitCore $*.java	

clean:
	rm -f  $(BINDIR)/*.class
	rm -Rf doc
