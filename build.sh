javac -sourcepath src -d build src/Main.java;
cd build;
jar -cmf ../src/MANIFEST.MF ../bin/Main.jar * */*.class;
cd ..;
java -jar bin/Main.jar;
