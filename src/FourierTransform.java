public class FourierTransform {

    // Static method to calculate the Discrete Fourier Transform (DFT) of a given signal.
    // The DFT is used to transform a time-domain signal into its frequency-domain representation.
    // It takes an array of real numbers (signal) and returns an array of Complex numbers representing the Fourier coefficients.
    // Formula: X(k) = sum [from n=0 to N-1 of x(n)] * exp(-i * 2π * k * n / N), where k = 0, 1, ..., N-1
    public static Complex[] dft(double[] signal) {
        int N = signal.length; // Length of the input signal
        Complex[] result = new Complex[N]; // Array to hold the Fourier coefficients

        // Loop through each frequency component (k)
        for (int k = 0; k < N; k++) {
            Complex sum = new Complex(0, 0);                      // Initialize the sum for the current frequency component

            for (int n = 0; n < N; n++) {                                   // Loop through each time sample (n)
                double angle = 2 * Math.PI * k * n / N;                     // Calculate the angle for the current time and frequency index
                Complex w = new Complex(Math.cos(angle), -Math.sin(angle)); // Create a complex number for the twiddle factor (e^(-i*angle)) = cos(sngle)-sin(angle)
                sum = sum.add(w.multiply(new Complex(signal[n], 0)));  // Add the contribution of the current sample to the sum
            }

            result[k] = sum;                                                // Store the resulting Fourier coefficient for the current frequency k
        }

        return result; // Return the array of Fourier coefficients (complex numbers)
    }

    // Method to compute the magnitude
    public static double[] getMagnitude(Complex[] spectrum) {
        double[] magnitudes = new double[spectrum.length];  // Array to hold the magnitudes

        for (int i = 0; i < spectrum.length; i++) {         // Loop through each Fourier coefficient in the spectrum
            magnitudes[i] = spectrum[i].magnitude();        // Get the magnitude via complex class
        }

        return magnitudes; // Return the array of magnitudes
    }

    // Method to compute the phase
    public static double[] getPhase(Complex[] spectrum) {
        double[] phases = new double[spectrum.length];  // Array to hold the phases

        for (int i = 0; i < spectrum.length; i++) {     // Loop through each Fourier coefficient in the spectrum
            phases[i] = spectrum[i].phase();            // Get the phase of the current Fourier coefficient
        }

        return phases; // Return the array of phases
    }
}
