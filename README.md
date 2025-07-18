# Alarm Clock - Console-Based Java Application

A simple Java console application that functions as an alarm clock. Users can set alarms, and the program plays a selected audio file when the specified time is reached.

## Table of Contents

- [Project Description](#project-description)
- [Installation and Setup](#installation-and-setup)
- [Usage Instructions](#usage-instructions)
- [Tools Used](#tools-used)
- [Contributing](#contributing)
- [Contact](#contact)

## Project Description

This console-based alarm clock application is developed in Java and allows users to:

- View current time
- Set an alarm through console input
- Play an MP3 file as an alarm ringtone

The program uses Java's core libraries for time handling and threads, and **JLayer (javazoom)** library to play MP3 audio files.

### Motivation

The project was built to:

- Practice Java object-oriented programming
- Learn how to use threads and timers
- Integrate third-party libraries for MP3 playback

## Installation and Setup

Follow these steps to run the project on your local machine:

### 1. **Clone the Repository**

```bash
git clone https://github.com/sohaibzafar89/Alarm-Clock.git
```

### 2. **Navigate to the Project Folder**

```bash
cd Alarm-Clock
```

### 3. **Compile the Java Files**

Make sure you have `javac` installed and available in your system path.

```bash
javac *.java
```

### 4. **Run the Application**

```bash
java MainClock
```

> 🔔 Ensure your console has access to system audio to hear the alarm sound.

## Usage Instructions

1. Run the program using the terminal or command prompt.
2. The current time will be displayed continuously.
3. You’ll be prompted to enter an alarm time in HH:mm format.
4. When the system clock matches the alarm time, the MP3 audio file from the audio folder will play.

### Example Console Output:

```sql
Current Time: 10:58
Enter Alarm Time (HH:mm): 11:00
Alarm set for 11:00
Waiting for alarm...
🎵 Playing: Music To Watch Boys To.mp3
```

## Tools Used

1. Java SE 8+
2. JLayer (Javazoom) for MP3 playback
3. Command Line / Terminal
4. Eclipse IDE

## Contributing

Contributions are welcome!<br>
To contribute:

1. Fork this repository
2. Create a new branch (`git checkout -b feature-name`)
3. Commit your changes (`git commit -m "Add feature"`)
4. Push to the branch (`git push origin feature-name`)
5. Open a Pull Request

## Contact

> For questions or suggestions, feel free to reach out via GitHub Issues or fork and contribute to this repo!
