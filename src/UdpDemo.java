import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UdpDemo {
	public static void main(String[] args) throws  IOException {
	for (int i = 0; i <=500; i++) {

		//��������
		//�ɸ봫��Э��
		String content = "1_lbt4_10#32899#002481627512#0#0#0:1289671407:admin:test:288:һ�ղ������������";
		byte[] SendBuf = content.getBytes("GBK");
		//����Udp����
		DatagramSocket client = new DatagramSocket();
		//Ŀ��ip
		InetAddress addr = InetAddress.getByName("192.168.86.22");
		//����˿ں�
		int  port=2425;
		DatagramPacket clientPacket = new DatagramPacket(SendBuf, SendBuf.length, addr, port);
		client.send(clientPacket);
	}
		
	}
}
