# Pure code by Robert Martin

## Chapter 2: Names

### Variables

- meaningful
- easy pronounce
- easy search: var length -> scope
- no suffix & prefix

 ### Methods

- verbs & words
- constructors overloading
  - private constructors
  - static method-factories (names -> args)

## Chapter 3: Functions

- compactness
- 1-2 tabs inside
- one operation per f()
    - one abstraction lvl
    - try to say "TO f()" (from LOGO lang)
- top to bottom reading (!!! very important)
- args
    - try to decrease # of args to one
    - flags - ugly
    - objects as args, if they are one thing
    - args list []
- verb + key word
- avoid side effects
- avoid output args
    - if f() has to change someone's state, let it be the f()'s Obj
- divide commands and requests
- exceptions instead of errors flags
- isolate try/catch -> separate f()
  - error processing as one operation
    
## Chapter 4: Comments

- always fact of losing
- it's better to refactor code
- law comments -> a bit of info & links
- small informative -> good
- TODO
- Javadoc in public API
- not all f()'s have to have Javadoc
- use f() or var instead of comment, where it's possible

## Chapter 6: Objects & Data Structures (DS)

- Unreasonable adding setters & getters - the worst option
- Procedure code (tha use DS)
  - easy function adding -> no changing in DS
  - hard data structure adding -> have to change all functions
- OOP code
  - easy class adding -> no changing in functions
  - hard function adding -> have to change all classes
- DTO (Data Transfer Object)
  - class with public vars (or bean-access)
  - without functions
  - useful when work with DB, read msg from socket
- Active Records (type of DTO)
  - class with public vars (or bean-access)
  - navigation methods: save, find

## Chapter 7: Error Processing

