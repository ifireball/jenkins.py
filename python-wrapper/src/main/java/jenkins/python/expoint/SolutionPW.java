package jenkins.python.expoint;


import hudson.model.AdministrativeMonitor;
import jenkins.model.Jenkins;
import hudson.model.AbstractModelObject;
import hudson.Extension;
import hudson.ExtensionPoint;
import hudson.ExtensionList;
import org.kohsuke.stapler.HttpResponse;
import org.kohsuke.stapler.HttpResponses;
import org.kohsuke.stapler.QueryParameter;
import java.io.IOException;
import java.util.List;
import hudson.diagnosis.*;
import hudson.diagnosis.HudsonHomeDiskUsageMonitor.Solution.*;
import hudson.diagnosis.HudsonHomeDiskUsageMonitor.*;
import hudson.search.SearchFactory;
import org.kohsuke.stapler.StaplerRequest;
import org.kohsuke.stapler.StaplerResponse;
import org.kohsuke.stapler.Stapler;
import javax.servlet.ServletException;
import hudson.search.SearchableModelObject;
import hudson.search.Search;
import hudson.search.SearchIndexBuilder;
import hudson.search.SearchIndex;
import org.kohsuke.stapler.interceptor.RequirePOST;
import hudson.model.*;
import hudson.model.AbstractModelObject.*;
import jenkins.python.DataConvertor;
import jenkins.python.PythonExecutor;

/**
 * This class was automatically generated by the PWM tool on 2014/03/21.
 * @see hudson.diagnosis.HudsonHomeDiskUsageMonitor.Solution
 */
public abstract class SolutionPW extends Solution {
	private transient PythonExecutor pexec;

	private void initPython() {
		if (pexec == null) {
			pexec = new PythonExecutor(this);
			String[] jMethods = new String[0];
			String[] pFuncs = new String[0];
			Class[][] argTypes = new Class[0][];
			pexec.checkAbstrMethods(jMethods, pFuncs, argTypes);
			String[] functions = new String[4];
			functions[0] = "get_url";
			functions[1] = "make_search_index";
			functions[2] = "get_search";
			functions[3] = "get_search_name";
			int[] argsCount = new int[4];
			argsCount[0] = 0;
			argsCount[1] = 0;
			argsCount[2] = 0;
			argsCount[3] = 0;
			pexec.registerFunctions(functions, argsCount);
		}
	}

	public SolutionPW(String id) {
		super(id);
	}

	public SolutionPW() {
		super();
	}

	@Override
	public String getUrl() {
		initPython();
		if (pexec.isImplemented(0)) {
			return (String) pexec.execPython("get_url");
		} else {
			return super.getUrl();
		}
	}

	@Override
	public SearchIndexBuilder makeSearchIndex() {
		initPython();
		if (pexec.isImplemented(1)) {
			return (SearchIndexBuilder) pexec.execPython("make_search_index");
		} else {
			return super.makeSearchIndex();
		}
	}

	@Override
	public Search getSearch() {
		initPython();
		if (pexec.isImplemented(2)) {
			return (Search) pexec.execPython("get_search");
		} else {
			return super.getSearch();
		}
	}

	@Override
	public String getSearchName() {
		initPython();
		if (pexec.isImplemented(3)) {
			return (String) pexec.execPython("get_search_name");
		} else {
			return super.getSearchName();
		}
	}

	public String superGetUrl() {
		return super.getUrl();
	}

	public SearchIndexBuilder superMakeSearchIndex() {
		return super.makeSearchIndex();
	}

	public Search superGetSearch() {
		return super.getSearch();
	}

	public String superGetSearchName() {
		return super.getSearchName();
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
