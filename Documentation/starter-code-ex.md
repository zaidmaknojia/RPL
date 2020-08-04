# Syntax

## Variable Declaration:
 ``` let a = 5;```\
```  let b = "Hello World";```\
  ```let c = true;```
 
## Variable Reassignment(not static):
 ``` a = 7; ```\
 ``` b = 4; ```\
 ``` c = "Bye";```
 
## Variable Scoping:
``` 
let a = "global a";
let b = "global b";
let c = "global c";
{
  let a = "outer a";
  let b = "outer b";
  {
    let a = "inner a";
    print a; //inner a
    print b; //outer b
    print c; //global c
  }
  print a; //outer a
  print b; //outer b
  print c; //global c
}
print a; //global a
print b; //global b
print c; //global c
```
 
## Print Statements:
 ``` print a;```
 OR
``` print(a);```
 


