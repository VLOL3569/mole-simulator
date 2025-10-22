# Mole Simulator

A Java-based educational chemistry game where players identify chemical elements by their symbols. Help the mole learn chemistry while earning points and collecting items!

## Game Description

The Mole Simulator is an interactive educational game that helps players learn chemical elements. Players are presented with element symbols and must correctly identify the corresponding element names to earn points. 


### 🎮 Gameplay Demo  
[![Gameplay Demo](https://img.youtube.com/vi/vDiyhgLOjI8/0.jpg)](https://www.youtube.com/watch?v=vDiyhgLOjI8)  
[![Watch on YouTube](https://img.shields.io/badge/Watch%20on-YouTube-red?logo=youtube)](https://www.youtube.com/watch?v=vDiyhgLOjI8)

## System Requirements

- **Java**: Java 8 or higher (tested with Java 22)
- **Operating System**: Windows, macOS, or Linux
- **Memory**: Minimum 512MB RAM

## Installation & Setup

1. **Download the project** to your local machine
2. **Ensure Java is installed**:
   ```bash
   java -version
   ```
## How to Run

### Option 1: Using Batch Files (Windows - Recommended)

Navigate to the `mole/dist/` directory and double-click one of these files:
- `run-mole.bat` - Runs the original jar file
- `run-mole-fixed.bat` - Runs the fixed jar file with proper manifest

### Option 2: Command Line

Open a terminal/command prompt and navigate to the `mole/dist/` directory:

```bash
cd "path/to/mole-simulator-main/mole/dist"
```

Then run one of these commands:

**For the original jar:**
```bash
java -cp "mole.jar;lib\AbsoluteLayout.jar" frmHome
```

**For the fixed jar:**
```bash
java -cp "mole-fixed.jar;lib\AbsoluteLayout.jar" frmHome
```

**For Linux/macOS users:**
```bash
java -cp "mole.jar:lib/AbsoluteLayout.jar" frmHome
```

### Option 3: Direct Jar Execution (Fixed Version Only)

If you're using the `mole-fixed.jar` file:
```bash
java -jar mole-fixed.jar
```
## Game Controls

- **Text Input**: Type the element name in the text field
- **Enter Button**: Submit your answer
- **Shop Button**: Access the item shop
- **Dictionary Button**: View the periodic table reference
- **How to Play Button**: View game instructions

### File Structure

```
mole-simulator-main/
├── mole/
│   ├── src/                    # Java source files
│   ├── build/classes/          # Compiled classes
│   ├── dist/                   # Distribution files
│   │   ├── mole.jar           # Original jar file
│   │   ├── mole-fixed.jar     # Fixed jar with proper manifest
│   │   ├── lib/               # Dependencies
│   │   │   └── AbsoluteLayout.jar
│   │   ├── run-mole.bat       # Windows batch file
│   │   └── run-mole-fixed.bat # Windows batch file for fixed jar
│   └── manifest.mf            # Jar manifest file
└── README.md                  # This file
```

## Development

### Building from Source

If you want to rebuild the project:

1. Ensure you have Java JDK and Ant installed
2. Navigate to the `mole/` directory
3. Run: `ant clean jar`

### Project Details

- **Language**: Java
- **Framework**: Java Swing
- **IDE**: NetBeans
- **Dependencies**: AbsoluteLayout (NetBeans library)
- **Target Java Version**: Java 13+

## Educational Value

This game helps students learn:
- Chemical element symbols and names
- Basic chemistry concepts
- Pattern recognition
- Memory skills

The game covers elements from Hydrogen (H) to Barium (Ba), providing a solid foundation in basic chemistry education.

