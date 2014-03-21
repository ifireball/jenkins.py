package jenkins.python.expoint;


import hudson.DescriptorExtensionList;
import hudson.ExtensionPoint;
import hudson.model.AbstractDescribableImpl;
import hudson.model.Descriptor;
import hudson.model.Hudson;
import java.io.IOException;
import java.io.OutputStream;
import hudson.security.captcha.*;
import hudson.security.captcha.CaptchaSupport.*;
import jenkins.model.Jenkins;
import hudson.model.*;
import hudson.model.AbstractDescribableImpl.*;
import jenkins.python.DataConvertor;
import jenkins.python.PythonExecutor;

/**
 * This class was automatically generated by the PWM tool on 2014/03/21.
 * @see hudson.security.captcha.CaptchaSupport
 */
public abstract class CaptchaSupportPW extends CaptchaSupport {
	private transient PythonExecutor pexec;

	private void initPython() {
		if (pexec == null) {
			pexec = new PythonExecutor(this);
			String[] jMethods = new String[2];
			jMethods[0] = "validateCaptcha";
			jMethods[1] = "generateImage";
			String[] pFuncs = new String[2];
			pFuncs[0] = "validate_captcha";
			pFuncs[1] = "generate_image";
			Class[][] argTypes = new Class[2][];
			argTypes[0] = new Class[2];
			argTypes[0][0] = String.class;
			argTypes[0][1] = String.class;
			argTypes[1] = new Class[2];
			argTypes[1][0] = String.class;
			argTypes[1][1] = OutputStream.class;
			pexec.checkAbstrMethods(jMethods, pFuncs, argTypes);
			String[] functions = new String[1];
			functions[0] = "get_descriptor";
			int[] argsCount = new int[1];
			argsCount[0] = 0;
			pexec.registerFunctions(functions, argsCount);
		}
	}

	@Override
	public boolean validateCaptcha(String id, String text) {
		initPython();
		return pexec.execPythonBool("validate_captcha", id, text);
	}

	@Override
	public void generateImage(String id, OutputStream ios) throws IOException {
		initPython();
		pexec.execPythonVoid("generate_image", id, ios);
	}

	@Override
	public CaptchaSupportDescriptor getDescriptor() {
		initPython();
		if (pexec.isImplemented(0)) {
			return (CaptchaSupportDescriptor) pexec.execPython("get_descriptor");
		} else {
			return super.getDescriptor();
		}
	}

	public CaptchaSupportDescriptor superGetDescriptor() {
		return super.getDescriptor();
	}

	public Object execPython(String function, Object... params) {
		initPython();
		return pexec.execPython(function, params);
	}

	public byte execPythonByte(String function, Object... params) {
		initPython();
		return pexec.execPythonByte(function, params);
	}

	public short execPythonShort(String function, Object... params) {
		initPython();
		return pexec.execPythonShort(function, params);
	}

	public char execPythonChar(String function, Object... params) {
		initPython();
		return pexec.execPythonChar(function, params);
	}

	public int execPythonInt(String function, Object... params) {
		initPython();
		return pexec.execPythonInt(function, params);
	}

	public long execPythonLong(String function, Object... params) {
		initPython();
		return pexec.execPythonLong(function, params);
	}

	public float execPythonFloat(String function, Object... params) {
		initPython();
		return pexec.execPythonFloat(function, params);
	}

	public double execPythonDouble(String function, Object... params) {
		initPython();
		return pexec.execPythonDouble(function, params);
	}

	public boolean execPythonBool(String function, Object... params) {
		initPython();
		return pexec.execPythonBool(function, params);
	}

	public void execPythonVoid(String function, Object... params) {
		initPython();
		pexec.execPythonVoid(function, params);
	}
}
