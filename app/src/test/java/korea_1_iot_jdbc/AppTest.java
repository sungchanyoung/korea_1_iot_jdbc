/*
 * This source file was generated by the Gradle 'init' task
 */
package korea_1_iot_jdbc;

import org.junit.jupiter.api.Test;

import korea_1_iot_jdbc.main.UserManager;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    public static void main(String[] args) {
		UserManager userManager = new UserManager();
		try {
			userManager.run();
		}catch (Exception e) {
			e.printStackTrace();
		}
    }
    }