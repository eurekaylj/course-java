package cn.edu.ncu.eureka;

import com.sun.jna.Library;

public interface CLibrary extends Library{
    public CLibrary Instance = new CLibrary() {
        @Override
        public void printf(String hello_world) {

        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return super.toString();
        }
    };

    void printf(String hello_world);
}
