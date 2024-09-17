package BloqueI.Luis;

public class LinealVirusScanner extends VirusScanEngine {
    private static final byte [] [] virusSignatures = new byte[][]{
            new byte[] {'I', 'L', 'A', 'O', 'V', 'E'},
            new byte[] {'M', 'E', 'L', 'I', 'S', 'S', 'A'}
    };

    @Override
    void deleteVirus(byte[] memory, int starIndex, int size) {

    }

    @Override
    void reportVirus(byte[] memory, int starIndex, int size) {

    }

    @Override
    int findVirus(byte[] memory, int starIndex) {
        int size = 0;
        scan:
        {
            signatures: for (int v = 0; v < virusSignatures.length; v++) {
                for (int t = 0; t< virusSignatures[v].length; t++) {
                    if (memory[starIndex + t] != virusSignatures[v][t]) {
                        break scan;
                    }
                }
                size = virusSignatures[v].length;
                break signatures;
            }
        }
        return size;
    }

}
