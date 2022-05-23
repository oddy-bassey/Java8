# Lambda Expression
This is a new feature of Java8 which provides a clear and concise way to represent/express a method.

The basic qualities of a lambda expression is that the methods have:
-
* no name
* no modifier
* no return type

Note: Lambda can only be used with *functional interface*

Lambda Expression Syntax
- 
* The simplest lambda expression contains a single parameter and  expression
* (arguement_list) -> {body}
    </br> param1, param2 -> expression (for single line expression e.g return statement)
    </br> param1, param2 -> {expression} (for multiple line expressions)

Benefits of Lambda
- 
* Reduce the number of line of code
* supports sequence and parallel execution by passing the behaviour as an argument(assign function as input parameter)
* Lambda can be written with functional interface only
* Many API can be called easily like steam APIs
* Code becomes more readable and maintainable

Where is Lambda used?
- 
* It's used in the context of **Functional Interface**
</br>Note: **functional interface** *is an interface that contains/specifies only one abstract method. (SAM) -> single abstract method*
    </br> Before Java8,several other functional interface like Runnable and Comparator were available.
    </br> Example: Comparator, Runnable, ActionListener, Callable e.t.c