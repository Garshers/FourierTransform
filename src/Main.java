public class Main {
    public static void main(String[] args) {
        // Composite signal with 3 sine waves
        int N = 512; // Number of samples
        double sampleRate = 1000; // Sampling rate in Hz
        double[] signal = new double[N];

        // Parameters for the 3 sine waves
        double[] amplitudes = {1.0, 0.1, 0.8}; // Amplitudes
        double[] frequencies = {50, 150, 300}; // Frequencies in Hz

        // Generate the composite signal
        for (int i = 0; i < N; i++) {
            double t = i / sampleRate; // Time for each sample
            signal[i] = amplitudes[0] * Math.sin(2 * Math.PI * frequencies[0] * t) +
                        amplitudes[1] * Math.sin(2 * Math.PI * frequencies[1] * t) +
                        amplitudes[2] * Math.sin(2 * Math.PI * frequencies[2] * t);
        }

        // Perform the Fourier Transform
        Complex[] spectrum = FourierTransform.dft(signal);

        // Get the magnitude of the Fourier coefficients
        double[] magnitude = FourierTransform.getMagnitude(spectrum);

        // Output the result
        System.out.println("Frequency Magnitudes:");
        for (int i = 0; i < N / 2; i++) { // Only show up to Nyquist frequency
            double freq = i * sampleRate / N;
            System.out.printf("%.2f Hz: %.2f%n", freq, magnitude[i]);
        }
    }
}
