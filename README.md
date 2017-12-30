Arithmetic DSL
=========

Compiling/Running
------
In order to compile and run the code, you need to install 'sbt'.

You can run the main file using the following command:

`sbt run`

Step 1
------
At this step, we implement the AST and parser for a simple arithmetic DSL with the following constructs:
1) addition, 2) substraction, and 3) a constant value.

Step 2
------
At this step, we define an interpreter for the DSL we have defined in the previous step.

Step 3
------
At this step, we extend the DSL with the following constructs:
4) multiplication, and 5) division.

Note how the AST, the parser, and the interpreter are modified to reflect the changes to the DSL. 

Step 4
------
At this step, the DSL supports the definition of a (constant) variable. To define a variable we use
the following syntax:

`let x = e1 in e2`

in which we initialize the variable named `x` with the expression `e1`. This variable can be used
in the expression `e2`. 

As an example, in the following program:

`let x = 2 * 3 in x * 4`

the variable `x` is initialized with the expression `2 * 3`. This variable is then used in the 
expression `x * 4`. This program is evaluated to `24` in the run time.

Step 5
------
Finally, we add a C code generator for this DSL. 
