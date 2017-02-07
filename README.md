
# Enigma v0.10.4 beta
A deobfuscator tool for JavaSE bytecode

Copyright Jeff Martin, 2015 modified by Jaschar Domann, 2017


## LICENSE

Enigma is distributed under the GNU Lesser General Public license version 3

Enigma includes a modified version of Procyon which is distributed under the Apache license version 2. Procyon is copyrighted by Mike Strobel, 2013  
https://bitbucket.org/mstrobel/procyon

Enigma includes unmodified versions of the following libraries which are also released under the Apache license version 2.
 + Guava
 + Javassist
 + JSyntaxPane

Copies of the GNU Lesser General Public license verion 3 and the Apache license v2 have been included in this distribution.

## ASSEMBLE ENIGMA

**With gradle installed and in PATH:**
   
    $> gradlew assemble

## USING ENIGMA

Go to folder `build/libs`

**Launch the GUI:**
    
    $> java -jar enigma-x.y.z-thin.jar
	
**Use Enigma on the command line:**
    
    $> java -cp enigma-x.y.z-thin.jar cuchaz.enigma.CommandMain

## Original Repository 
https://bitbucket.org/cuchaz/enigma