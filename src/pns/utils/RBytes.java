/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pns.utils;

/**
 *
 * @author jpdw
 */
public class RBytes {
 
    
// *******************  BYTES *******************
    /**
     * Gets random byte value
     * @return 
     */
    public static byte rndByte(){
        double r = Math.random();
        byte b = (byte)(-r*128 + (1 - r)*127 );
        return b;
    }
    /**
     * Gets random byte value between min and max
     * @param min of byte type
     * @param max of byte type
     * @return 
     */
    public static byte rndByte( byte min, byte max ){
        double r = Math.random();
        byte b = (byte)(r*min + (1 - r)*max );
        return b;
    }
    /**
     * Get random byte array with random length.
     * The length is limited by 100
     * @return 
     */
    public static byte[] rndByteArray( ){
        int length = (int)( Integer.MAX_VALUE*Math.random());
        if ( length > 100) length = 100;
        byte[] bs = new byte[length];
        for( int i = 0; i<bs.length; i++ ){
            bs[i] = rndByte();
        }
        return bs;
    }
    /**
     * Get random byte array with fixed length.
     * 
     * @param length
     * @return 
     */
    public static byte[] rndByteArray( int length){
        byte[] bs = new byte[length];
        for( int i = 0; i<bs.length; i++ ){
            bs[i] = rndByte();
        }
        return bs;
    }
    /**
     * Get random byte array with random length.
     * @param min
     * @param max
     * @return 
     */
    public static byte[] rndByteArray(  byte min, byte max ){
        int length = (int)( Integer.MAX_VALUE*Math.random());
        if ( length > 100) length = 100;
        byte[] bs = new byte[length];
        for( int i = 0; i<bs.length; i++ ){
            bs[i] = rndByte( min, max );
        }
        return bs;
    }
    /**
     * Get random byte array with fixed length.
     * the values are between min and max
     * @param length
     * @param min
     * @param max
     * @return 
     */
    public static byte[] rndByteArray( int length,  byte min, byte max ){
        byte[] bs = new byte[length];
        for( int i = 0; i<bs.length; i++ ){
            bs[i] = rndByte(min, max);
        }
        return bs;
    }

    
// *******************  INTEGERS *******************
    /**
     * Gets random int value
     * @return 
     */
    public static int rndInt(){
        double r = Math.random();
        int b = (int)(-r*128 + (1 - r)*127 );
        return b;
    }
    /**
     * Gets random int value between min and max
     * @param min of int type
     * @param max of int type
     * @return 
     */
    public static int rndInt( int min, int max ){
        double r = Math.random();
        int b = (int)(r*min + (1 - r)*max );
        return b;
    }
    /**
     * Get random int array with random length.
     * The length is limited by 100
     * @return 
     */
    public static int[] rndIntArray( ){
        int length = (int)( Integer.MAX_VALUE*Math.random());
        if ( length > 100) length = 100;
        int[] bs = new int[length];
        for( int i = 0; i<bs.length; i++ ){
            bs[i] = rndInt();
        }
        return bs;
    }
    /**
     * Get random int array with fixed length.
     * 
     * @param length
     * @return 
     */
    public static int[] rndIntArray( int length){
        int[] bs = new int[length];
        for( int i = 0; i<bs.length; i++ ){
            bs[i] = rndInt();
        }
        return bs;
    }
    /**
     * Get random int array with random length.
     * @param min
     * @param max
     * @return 
     */
    public static int[] rndIntArray(  int min, int max ){
        int length = (int)( Integer.MAX_VALUE*Math.random());
        if ( length > 100) length = 100;
        int[] bs = new int[length];
        for( int i = 0; i<bs.length; i++ ){
            bs[i] = rndInt( min, max );
        }
        return bs;
    }
    /**
     * Get random int array with fixed length.
     * the values are between min and max
     * @param length
     * @param min
     * @param max
     * @return 
     */
    public static int[] rndIntArray( int length,  int min, int max ){
        int[] bs = new int[length];
        for( int i = 0; i<bs.length; i++ ){
            bs[i] = rndInt(min, max);
        }
        return bs;
    }
        
// *******************  CHARS *******************    
    
    /**
     * Gets random char value
     * @return 
     */
    public static char rndChar(){
        double r = Math.random();
        char b = (char)(-r*128 + (1 - r)*127 );
        return b;
    }
    /**
     * Gets random char value between min and max
     * @param min of char type
     * @param max of char type
     * @return 
     */
    public static char rndChar( char min, char max ){
        double r = Math.random();
        byte b = (byte)(r*(byte)min + (1 - r)*(byte)max );
        return (char)b;
    }
    /**
     * Get random char array with random length.
     * The length is limited by 100
     * @return 
     */
    public static char[] rndCharArray( ){
        int length = (int)( Integer.MAX_VALUE*Math.random());
        if ( length > 100) length = 100;
        char[] bs = new char[length];
        for( int i = 0; i<bs.length; i++ ){
             bs[i] = (char)rndByte();
        }
        
        return bs;
    }
    
    /**
     * Get random char array with fixed length.
     * @param length
     * @return 
     */
    public static char[] rndCharArray( int length){
        char[] bs = new char[length];
        for( int i = 0; i<bs.length; i++ ){
             bs[i] = (char)rndByte( );
        }
        
        return bs;
    }
    /**
     * Get random char array with random length.
     * @param min
     * @param max
     * @return 
     */
    public static char[] rndCharArray(  char min, char max ){
        int length = (int)( Integer.MAX_VALUE*Math.random());
        if ( length > 100) length = 100;
        char[] bs = new char[length];
        for( int i = 0; i<bs.length; i++ ){
             bs[i] = (char)rndByte((byte)min, (byte)max);
        }
        
        return bs;
    }
    /**
     * Get random char array with fixed length.
     * the values are between min and max
     * @param length
     * @param min
     * @param max
     * @return 
     */
    public static char[] rndCharArray( int length,  char min, char max ){
        char[] bs = new char[length];
        for( int i = 0; i<bs.length; i++ ){
             bs[i] = (char)rndByte((byte)min, (byte)max);
        }
        
        return bs;
    }

    
    
    
    
}
