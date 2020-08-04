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
 
## Conditional Statements:
```
print "hi" or 2; // "hi"
print null or "yes"; // "yes"
```
```
let a = 4;
if(a == 2) {
  print("a is equal to 2");
} else {
  print("a is not equal to 2");
}
//prints "a is not equal to 2"
```

## Loop Declarations:

#### "For loop"

```
loop (let i = 0; i < 10; i = i + 1) {
       print i;
   }
   //Outputs 0,1,2,3,4,5,6,7,8,9 on new lines
```

#### "While loop"
```
let a = 0;
let b = 1;

while (a < 10000) {
  print a;
  let temp = a;
  a = b;
  b = temp + b;
}
//Outputs first 21 numbers in the Fibonacci Sequence
```

## Function Declaration
```
func fib(n) {
  if (n <= 1) 
     return n;
  return fib(n - 2) + fib(n - 1);
}
```
```
func makeCounter() {
  let i = 0;
  func count() {
    i = i + 1;
    print i;
  }

  return count;
}

let counter = makeCounter();
counter(); // "1"
counter(); // "2"
```
