package jenkins.python.expoint;


import hudson.AbortException;
import hudson.ExtensionList;
import hudson.ExtensionPoint;
import hudson.Launcher;
import hudson.model.AbstractBuild;
import jenkins.model.Jenkins;
import hudson.model.TaskListener;
import hudson.tasks.Publisher;
import java.io.IOException;
import hudson.tasks.test.*;
import hudson.tasks.test.TestResultParser.*;
import jenkins.python.DataConvertor;
import jenkins.python.PythonExecutor;

/**
 * This class was automatically generated by the PWM tool on 2014/03/21.
 * @see hudson.tasks.test.TestResultParser
 */
public abstract class TestResultParserPW extends TestResultParser {
	private transient PythonExecutor pexec;

	private void initPython() {
		if (pexec == null) {
			pexec = new PythonExecutor(this);
			String[] jMethods = new String[1];
			jMethods[0] = "parse";
			String[] pFuncs = new String[1];
			pFuncs[0] = "parse";
			Class[][] argTypes = new Class[1][];
			argTypes[0] = new Class[4];
			argTypes[0][0] = String.class;
			argTypes[0][1] = AbstractBuild.class;
			argTypes[0][2] = Launcher.class;
			argTypes[0][3] = TaskListener.class;
			pexec.checkAbstrMethods(jMethods, pFuncs, argTypes);
			String[] functions = new String[2];
			functions[0] = "get_display_name";
			functions[1] = "get_test_result_location_message";
			int[] argsCount = new int[2];
			argsCount[0] = 0;
			argsCount[1] = 0;
			pexec.registerFunctions(functions, argsCount);
		}
	}

	@Override
	public TestResult parse(String testResultLocations, AbstractBuild build, Launcher launcher, TaskListener listener) throws InterruptedException, IOException {
		initPython();
		return (TestResult) pexec.execPython("parse", testResultLocations, build, launcher, listener);
	}

	@Override
	public String getDisplayName() {
		initPython();
		if (pexec.isImplemented(0)) {
			return (String) pexec.execPython("get_display_name");
		} else {
			return super.getDisplayName();
		}
	}

	@Override
	public String getTestResultLocationMessage() {
		initPython();
		if (pexec.isImplemented(1)) {
			return (String) pexec.execPython("get_test_result_location_message");
		} else {
			return super.getTestResultLocationMessage();
		}
	}

	public String superGetDisplayName() {
		return super.getDisplayName();
	}

	public String superGetTestResultLocationMessage() {
		return super.getTestResultLocationMessage();
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
