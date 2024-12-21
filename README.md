# Fourier Transform Example

This project demonstrates how to perform a Discrete Fourier Transform (DFT) on a composite signal consisting of multiple sine waves. It includes the `Complex`, `FourierTransform`, and `Main` classes, with the goal of analyzing the frequency components of a signal.

## Classes and Functions

### 1. **Complex Class**
The `Complex` class is used to represent complex numbers and provides methods for basic operations on them, such as addition, multiplication, and calculating the magnitude and phase.

#### Key Methods:
- **add(Complex other)**: Adds another complex number to the current complex number.
- **multiply(Complex other)**: Multiplies the current complex number by another complex number.
- **magnitude()**: Returns the magnitude (absolute value) of the complex number.
- **phase()**: Returns the phase (angle) of the complex number in radians.
- **toString()**: Returns a string representation of the complex number in the form `(real + imag i)`.

### 2. **FourierTransform Class**
The `FourierTransform` class contains methods for performing the Discrete Fourier Transform (DFT) and extracting magnitude and phase information from the resulting Fourier coefficients.

#### Key Methods:
- **dft(double[] signal)**: Computes the Discrete Fourier Transform (DFT) of a real-valued signal. It returns an array of `Complex` objects representing the frequency components of the signal.
- **getMagnitude(Complex[] spectrum)**: Calculates the magnitude of each Fourier coefficient from the DFT result. It returns an array of magnitudes, each corresponding to a frequency component.
- **getPhase(Complex[] spectrum)**: Calculates the phase of each Fourier coefficient from the DFT result. It returns an array of phases (angles), each corresponding to a frequency component.

### 3. **Main Class**
The `Main` class contains the main entry point for the program and demonstrates how to generate a composite signal, perform the Fourier Transform, and display the results.

#### Key Steps in `main`:
- **Signal Generation**: A composite signal is created by combining three sine waves with different frequencies (50 Hz, 150 Hz, and 300 Hz) and amplitudes (1.0, 0.1, and 0.8).
- **Fourier Transform**: The `dft` method from the `FourierTransform` class is used to compute the Fourier coefficients of the signal.
- **Magnitude Calculation**: The `getMagnitude` method is used to extract the magnitude of each frequency component from the Fourier coefficients.
- **Output**: The frequencies and their corresponding magnitudes are printed to the console, showing only the frequency components up to the Nyquist frequency (half of the sampling rate).

---

## Dependencies

This project does not require any external libraries. It only depends on the Java standard library.

---

## License

This project is open-source and available under the MIT License."# FourierTransform" 
