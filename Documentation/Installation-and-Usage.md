---
sidebarDepth: 2
---
# Installation and Usage

## System Prerequisites
- A working terminal.
- Java installed.

### Windows
- Since the main runfile is a bash script, it's recommended that you install a Windows Subsystem for Linux (WSL) distribution on Windows.

> Go to Settings > Update & Security > For Developers. Check the Developer Mode radio button. And search for “Windows Features”, choose “Turn Windows features on or off”.

> Scroll to find WSL, check the box, and then install it. Once done, one has to reboot to finish installing the requested changes. Press Restart now.

### MacOS or Linux Distributions
- No problem, just pull up a terminal screen.

## Installation
Check out our code on either [https://github.com/zmaknojia20/RPL](https://github.com/zmaknojia20/RPL) or [https://github.com/harbom/Redaction-Programming-Language](https://github.com/harbom/Redaction-Programming-Language).

Or, download the files here: <a href="./Redaction.zip" download>Click to Download Redaction Files</a>

You'll need both the bash script and the JAR application to be in the same directory.

## Usage
Redaction is meant to run through a command line interface (CLI). It's main file is a bash script.

When running a file, note that the filename takes both relative and absolute path arguments. So it doesn't matter if you specify something from `C://Users...` on Windows or `/home/user/...` on Linux (absolute path), or `filename.redact` (relative path to current directory).

### Windows
Since WSL is installed, you have 2 options.

1. Use `bash`
    1. Interactive Interpreter
        - You will enter the equivalent to IDLE in Python where you will have an interactive interpreter session.
        - To enter this, type:
        ```
        bash redact.sh
        ```

    2. Running a Redaction file
        ```
        bash redact.sh <filename>
        ```

2. Execute the bash script using an Ubuntu shell
    - See the following section.


### MacOS / Linux Distributions
First, run the following. This will make the bash script an executable.

```
chmod +x redact.sh
```

Then, to execute the script, you have 2 options.

1. Interactive Interpreter
    - You will enter the equivalent to IDLE in Python where you will have an interactive interpreter session.
    - To enter this, type:
    ```
    ./redact.sh
    ```
    or
    ```
    sh redact.sh
    ```

2. Running a Redaction file
    - To do this, type either of the following:
    ```
    ./redact.sh <filename>
    ```
    or
    ```
    sh redact.sh <filename>
    ```

<br><br><br>

**Created by Zaid Maknojia and Harish Bommakanti**