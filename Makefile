all: compile

compile:
	java -jar jtb-custom.jar -te tinyJava.jj
	javacc tinyJava-jtb.jj
	javac Main.java
	javac base_type/*.java
	javac symbol_table/*.java
	# javac tinyram_generator/*.java
	
execute:
	java Main

clean:
	rm -f *.class *~ base_type/*.class symbol_table/*.class syntaxtree/*.class visitor/*.class ./tinyjava-examples/*.asm
