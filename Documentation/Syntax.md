---
sidebarDepth: 2
---
# Syntax

## Variable Declaration and Reassignment
- Variable assignment and reassignment mimic python and javascript with its loose typing
```redaction   
let a = 5;
let b = "Hello World";
let c = true;

a = 7;
b = 4;
c = "Bye";
```
 
## Variable Scoping
- Scoping works likes most languages, capable of supporting complicated nested structures.
```redaction
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
 
## Print Statements
- Follows either Python 2 or Python 3 print statement style.
```redaction
print a;
//OR
print(a);
```
 
## Conditional Statements

- `and` and `or` statements inspired by Python.
- Uses 'truthy' logic shared by most languages, but tried to avoid Javascript's truthy logic ([see why](https://i.redd.it/4skcofasa1p01.png)).

```redaction
print "hi" or 2; // "hi"
print null or "yes"; // "yes"

let a = 4;
if(a == 2) {
  print("a is equal to 2");
} else {
  print("a is not equal to 2");
}
//prints "a is not equal to 2"
```

## Loop Declarations
- The `loop` (analog to the for loop) and `while` loops have the exact same syntax as most C based languages.
```redaction
//"For loop"
loop (let i = 0; i < 10; i = i + 1) {
       print i;
   }
   //Outputs 0,1,2,3,4,5,6,7,8,9 on new lines

//"While Loop"
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
- Uses keyword `func` to declare a new function.
- Supports nested function and some functional programming concepts shared by Python.
```redaction
func fib(n) {
  if (n <= 1) 
     return n;
  return fib(n - 2) + fib(n - 1);
}

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

<br><br><br>

**Created by Zaid Maknojia and Harish Bommakanti**