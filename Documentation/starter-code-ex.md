# Syntax

Variable Declaration:
 ``` let a = 5;```
```  let b = "Hello World";```
  ```let c = true;```
 
  Variable Reassignment(not static):
 - a = 7;
 - b = 4;
 - c = "Bye";
 
 Variable Scoping:
let a = "global a";
var b = "global b";
var c = "global c";
{
  var a = "outer a";
  var b = "outer b";
  {
    var a = "inner a";
    print a;
    print b;
    print c;
  }
  print a;
  print b;
  print c;
}
print a;
print b;
print c;
 
 Print Statements:
 - print a;
 OR
 - print(a);
 


