/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Antonio Cua
 */
public class ob {
     //_________________________________________________________________
public static void gravarObjecto(Serializable s, String fich) throws Exception {
ObjectOutputStream oos = null;
try {
File file = new File(fich);
FileOutputStream fos = new FileOutputStream(file);
oos = new ObjectOutputStream(fos);
oos.writeObject(s);
} finally {
if (oos != null) {
oos.close();
}
}
}
//_________________________________________________________________
public static Object lerObjecto(String fich) throws IOException, ClassNotFoundException {
ObjectInputStream ois = null;
try {
File file = new File(fich);
FileInputStream fis = new FileInputStream(file);
ois = new ObjectInputStream(fis);
Object ob = ois.readObject();
return ob;
} finally {
if (ois != null) {
ois.close();
}
}
}
//______________________
}
