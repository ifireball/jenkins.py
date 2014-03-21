package jenkins.python.expoint;


import hudson.Extension;
import hudson.ExtensionList;
import hudson.ExtensionPoint;
import hudson.tasks.BuildStep;
import jenkins.model.Jenkins;
import java.util.Collection;
import hudson.model.*;
import hudson.model.TransientProjectActionFactory.*;
import jenkins.python.DataConvertor;
import jenkins.python.PythonExecutor;

/**
 * This class was automatically generated by the PWM tool on 2014/03/21.
 * @see hudson.model.TransientProjectActionFactory
 */
public abstract class TransientProjectActionFactoryPW extends TransientProjectActionFactory {
	private transient PythonExecutor pexec;

	private void initPython() {
		if (pexec == null) {
			pexec = new PythonExecutor(this);
			String[] jMethods = new String[1];
			jMethods[0] = "createFor";
			String[] pFuncs = new String[1];
			pFuncs[0] = "create_for";
			Class[][] argTypes = new Class[1][];
			argTypes[0] = new Class[1];
			argTypes[0][0] = AbstractProject.class;
			pexec.checkAbstrMethods(jMethods, pFuncs, argTypes);
			String[] functions = new String[0];
			int[] argsCount = new int[0];
			pexec.registerFunctions(functions, argsCount);
		}
	}

	@Override
	public Collection<? extends Action> createFor(AbstractProject target) {
		initPython();
		return (Collection) pexec.execPython("create_for", target);
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
