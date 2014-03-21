package jenkins.python.expoint;


import hudson.DescriptorExtensionList;
import hudson.Extension;
import hudson.ExtensionPoint;
import hudson.model.AbstractDescribableImpl;
import hudson.model.Descriptor;
import jenkins.model.GlobalConfiguration;
import jenkins.model.Jenkins;
import hudson.model.MyViewsProperty;
import net.sf.json.JSONObject;
import org.kohsuke.stapler.StaplerRequest;
import hudson.views.*;
import hudson.views.MyViewsTabBar.*;
import hudson.model.*;
import hudson.model.AbstractDescribableImpl.*;
import jenkins.python.DataConvertor;
import jenkins.python.PythonExecutor;

/**
 * This class was automatically generated by the PWM tool on 2014/03/21.
 * @see hudson.views.MyViewsTabBar
 */
public abstract class MyViewsTabBarPW extends MyViewsTabBar {
	private transient PythonExecutor pexec;

	private void initPython() {
		if (pexec == null) {
			pexec = new PythonExecutor(this);
			String[] jMethods = new String[0];
			String[] pFuncs = new String[0];
			Class[][] argTypes = new Class[0][];
			pexec.checkAbstrMethods(jMethods, pFuncs, argTypes);
			String[] functions = new String[1];
			functions[0] = "get_descriptor";
			int[] argsCount = new int[1];
			argsCount[0] = 0;
			pexec.registerFunctions(functions, argsCount);
		}
	}

	@Override
	public MyViewsTabBarDescriptor getDescriptor() {
		initPython();
		if (pexec.isImplemented(0)) {
			return (MyViewsTabBarDescriptor) pexec.execPython("get_descriptor");
		} else {
			return super.getDescriptor();
		}
	}

	public MyViewsTabBarDescriptor superGetDescriptor() {
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
