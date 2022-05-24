# Functional Interface
* Has only one abstract method which is also called SAM (Single Abstract Method)
* Multiple static and default methods that have an implementation can be present E.g Runnable, ActionListener, Comparable...
* Before Java8 we used to write anonymous implementation for Functional Interface with full signature
* Function, Predicate, supplier, Consumer are the FI available in Java8

**Note** A functional interface must have only one abstract method and any number of default or static methods
</br> It's not compulsory to have an interface annotated as a functional interface before it's identified as one
</br> If the interface meets the definition of a functional interface, then the Java compiler identifies it as one
</br> Annotating an interface as a functional interface only ensures it adheres to the rules for which an interface
</br> can be identified as a functional interface.