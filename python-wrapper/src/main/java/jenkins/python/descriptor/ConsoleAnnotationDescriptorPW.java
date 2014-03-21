package jenkins.python.descriptor;


import hudson.DescriptorExtensionList;
import hudson.ExtensionPoint;
import hudson.model.Descriptor;
import jenkins.model.Jenkins;
import hudson.util.TimeUnit2;
import org.kohsuke.stapler.StaplerRequest;
import org.kohsuke.stapler.StaplerResponse;
import org.kohsuke.stapler.WebMethod;
import javax.servlet.ServletException;
import java.io.IOException;
import java.net.URL;
import hudson.console.*;
import hudson.console.ConsoleAnnotationDescriptor.*;
import hudson.PluginWrapper;
import hudson.RelativePath;
import hudson.XmlFile;
import hudson.BulkChange;
import hudson.Util;
import hudson.model.listeners.SaveableListener;
import hudson.util.FormApply;
import hudson.util.ReflectionUtils;
import hudson.util.ReflectionUtils.Parameter;
import hudson.views.ListViewColumn;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.kohsuke.stapler.*;
import org.kohsuke.stapler.jelly.JellyCompatibleFacet;
import org.kohsuke.stapler.lang.Klass;
import org.springframework.util.StringUtils;
import org.jvnet.tiger_types.Types;
import org.apache.commons.io.IOUtils;
import hudson.Functions.*;
import hudson.util.QuotedStringTokenizer.*;
import static javax.servlet.http.HttpServletResponse.SC_NOT_FOUND;
import javax.servlet.RequestDispatcher;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Locale;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.beans.Introspector;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import hudson.model.*;
import hudson.model.Descriptor.*;
import jenkins.python.DataConvertor;
import jenkins.python.PythonExecutor;

/**
 * This class was automatically generated by the PWM tool on 2014/03/21.
 * @see hudson.console.ConsoleAnnotationDescriptor
 */
public abstract class ConsoleAnnotationDescriptorPW extends ConsoleAnnotationDescriptor {
	private transient PythonExecutor pexec;

	private void initPython() {
		if (pexec == null) {
			pexec = new PythonExecutor(this);
			String[] jMethods = new String[1];
			jMethods[0] = "getDisplayName";
			String[] pFuncs = new String[1];
			pFuncs[0] = "get_display_name";
			Class[][] argTypes = new Class[1][];
			argTypes[0] = new Class[0];
			pexec.checkAbstrMethods(jMethods, pFuncs, argTypes);
			String[] functions = new String[31];
			functions[0] = "has_script";
			functions[1] = "has_stylesheet";
			functions[2] = "do_script_js";
			functions[3] = "do_style_css";
			functions[4] = "get_id";
			functions[5] = "get_t";
			functions[6] = "get_descriptor_url";
			functions[7] = "get_check_url";
			functions[8] = "calc_fill_settings";
			functions[9] = "calc_auto_complete_settings";
			functions[10] = "get_property_type";
			functions[11] = "get_property_type_or_die";
			functions[12] = "get_property_type";
			functions[13] = "get_global_property_type";
			functions[14] = "new_instance";
			functions[15] = "new_instance";
			functions[16] = "get_klass";
			functions[17] = "get_help_file";
			functions[18] = "get_help_file";
			functions[19] = "get_help_file";
			functions[20] = "add_help_file_redirect";
			functions[21] = "configure";
			functions[22] = "configure";
			functions[23] = "get_config_page";
			functions[24] = "get_global_config_page";
			functions[25] = "get_possible_view_names";
			functions[26] = "save";
			functions[27] = "load";
			functions[28] = "get_config_file";
			functions[29] = "get_plugin";
			functions[30] = "do_help";
			int[] argsCount = new int[31];
			argsCount[0] = 0;
			argsCount[1] = 0;
			argsCount[2] = 2;
			argsCount[3] = 2;
			argsCount[4] = 0;
			argsCount[5] = 0;
			argsCount[6] = 0;
			argsCount[7] = 1;
			argsCount[8] = 2;
			argsCount[9] = 2;
			argsCount[10] = 2;
			argsCount[11] = 2;
			argsCount[12] = 1;
			argsCount[13] = 1;
			argsCount[14] = 1;
			argsCount[15] = 2;
			argsCount[16] = 0;
			argsCount[17] = 0;
			argsCount[18] = 1;
			argsCount[19] = 2;
			argsCount[20] = 3;
			argsCount[21] = 1;
			argsCount[22] = 2;
			argsCount[23] = 0;
			argsCount[24] = 0;
			argsCount[25] = 1;
			argsCount[26] = 0;
			argsCount[27] = 0;
			argsCount[28] = 0;
			argsCount[29] = 0;
			argsCount[30] = 2;
			pexec.registerFunctions(functions, argsCount);
		}
	}

	public ConsoleAnnotationDescriptorPW(Class<? extends ConsoleNote<?>> clazz) {
		super(clazz);
	}

	public ConsoleAnnotationDescriptorPW() {
		super();
	}

	@Override
	public String getDisplayName() {
		initPython();
		return (String) pexec.execPython("get_display_name");
	}

	@Override
	public boolean hasScript() {
		initPython();
		if (pexec.isImplemented(0)) {
			return pexec.execPythonBool("has_script");
		} else {
			return super.hasScript();
		}
	}

	@Override
	public boolean hasStylesheet() {
		initPython();
		if (pexec.isImplemented(1)) {
			return pexec.execPythonBool("has_stylesheet");
		} else {
			return super.hasStylesheet();
		}
	}

	@Override
	@WebMethod(name = "script.js")
	public void doScriptJs(StaplerRequest req, StaplerResponse rsp) throws IOException, ServletException {
		initPython();
		if (pexec.isImplemented(2)) {
			pexec.execPythonVoid("do_script_js", req, rsp);
		} else {
			super.doScriptJs(req, rsp);
		}
	}

	@Override
	@WebMethod(name = "style.css")
	public void doStyleCss(StaplerRequest req, StaplerResponse rsp) throws IOException, ServletException {
		initPython();
		if (pexec.isImplemented(3)) {
			pexec.execPythonVoid("do_style_css", req, rsp);
		} else {
			super.doStyleCss(req, rsp);
		}
	}

	@Override
	public String getId() {
		initPython();
		if (pexec.isImplemented(4)) {
			return (String) pexec.execPython("get_id");
		} else {
			return super.getId();
		}
	}

	@Override
	public Class<ConsoleNote<?>> getT() {
		initPython();
		if (pexec.isImplemented(5)) {
			return (Class) pexec.execPython("get_t");
		} else {
			return super.getT();
		}
	}

	@Override
	public String getDescriptorUrl() {
		initPython();
		if (pexec.isImplemented(6)) {
			return (String) pexec.execPython("get_descriptor_url");
		} else {
			return super.getDescriptorUrl();
		}
	}

	@Override
	public String getCheckUrl(String fieldName) {
		initPython();
		if (pexec.isImplemented(7)) {
			return (String) pexec.execPython("get_check_url", fieldName);
		} else {
			return super.getCheckUrl(fieldName);
		}
	}

	@Override
	public void calcFillSettings(String field, Map<String, Object> attributes) {
		initPython();
		if (pexec.isImplemented(8)) {
			pexec.execPythonVoid("calc_fill_settings", field, attributes);
		} else {
			super.calcFillSettings(field, attributes);
		}
	}

	@Override
	public void calcAutoCompleteSettings(String field, Map<String, Object> attributes) {
		initPython();
		if (pexec.isImplemented(9)) {
			pexec.execPythonVoid("calc_auto_complete_settings", field, attributes);
		} else {
			super.calcAutoCompleteSettings(field, attributes);
		}
	}

	@Override
	public @CheckForNull
	PropertyType getPropertyType(@Nonnull Object instance, @Nonnull String field) {
		initPython();
		if (pexec.isImplemented(10)) {
			return (PropertyType) pexec.execPython("get_property_type", instance, field);
		} else {
			return super.getPropertyType(instance, field);
		}
	}

	@Override
	public @Nonnull
	PropertyType getPropertyTypeOrDie(@Nonnull Object instance, @Nonnull String field) {
		initPython();
		if (pexec.isImplemented(11)) {
			return (PropertyType) pexec.execPython("get_property_type_or_die", instance, field);
		} else {
			return super.getPropertyTypeOrDie(instance, field);
		}
	}

	@Override
	public PropertyType getPropertyType(String field) {
		initPython();
		if (pexec.isImplemented(12)) {
			return (PropertyType) pexec.execPython("get_property_type", field);
		} else {
			return super.getPropertyType(field);
		}
	}

	@Override
	public PropertyType getGlobalPropertyType(String field) {
		initPython();
		if (pexec.isImplemented(13)) {
			return (PropertyType) pexec.execPython("get_global_property_type", field);
		} else {
			return super.getGlobalPropertyType(field);
		}
	}

	@Override
	public ConsoleNote<?> newInstance(StaplerRequest req) throws FormException {
		initPython();
		if (pexec.isImplemented(14)) {
			return (ConsoleNote) pexec.execPython("new_instance", req);
		} else {
			return super.newInstance(req);
		}
	}

	@Override
	public ConsoleNote<?> newInstance(StaplerRequest req, JSONObject formData) throws FormException {
		initPython();
		if (pexec.isImplemented(15)) {
			return (ConsoleNote) pexec.execPython("new_instance", req, formData);
		} else {
			return super.newInstance(req, formData);
		}
	}

	@Override
	public Klass<?> getKlass() {
		initPython();
		if (pexec.isImplemented(16)) {
			return (Klass) pexec.execPython("get_klass");
		} else {
			return super.getKlass();
		}
	}

	@Override
	public String getHelpFile() {
		initPython();
		if (pexec.isImplemented(17)) {
			return (String) pexec.execPython("get_help_file");
		} else {
			return super.getHelpFile();
		}
	}

	@Override
	public String getHelpFile(final String fieldName) {
		initPython();
		if (pexec.isImplemented(18)) {
			return (String) pexec.execPython("get_help_file", fieldName);
		} else {
			return super.getHelpFile(fieldName);
		}
	}

	@Override
	public String getHelpFile(Klass<?> clazz, String fieldName) {
		initPython();
		if (pexec.isImplemented(19)) {
			return (String) pexec.execPython("get_help_file", clazz, fieldName);
		} else {
			return super.getHelpFile(clazz, fieldName);
		}
	}

	@Override
	public void addHelpFileRedirect(String fieldName, Class<? extends Describable> owner, String fieldNameToRedirectTo) {
		initPython();
		if (pexec.isImplemented(20)) {
			pexec.execPythonVoid("add_help_file_redirect", fieldName, owner, fieldNameToRedirectTo);
		} else {
			super.addHelpFileRedirect(fieldName, owner, fieldNameToRedirectTo);
		}
	}

	@Override
	public boolean configure(StaplerRequest req) throws FormException {
		initPython();
		if (pexec.isImplemented(21)) {
			return pexec.execPythonBool("configure", req);
		} else {
			return super.configure(req);
		}
	}

	@Override
	public boolean configure(StaplerRequest req, JSONObject json) throws FormException {
		initPython();
		if (pexec.isImplemented(22)) {
			return pexec.execPythonBool("configure", req, json);
		} else {
			return super.configure(req, json);
		}
	}

	@Override
	public String getConfigPage() {
		initPython();
		if (pexec.isImplemented(23)) {
			return (String) pexec.execPython("get_config_page");
		} else {
			return super.getConfigPage();
		}
	}

	@Override
	public String getGlobalConfigPage() {
		initPython();
		if (pexec.isImplemented(24)) {
			return (String) pexec.execPython("get_global_config_page");
		} else {
			return super.getGlobalConfigPage();
		}
	}

	@Override
	public List<String> getPossibleViewNames(String baseName) {
		initPython();
		if (pexec.isImplemented(25)) {
			return (List) pexec.execPython("get_possible_view_names", baseName);
		} else {
			return super.getPossibleViewNames(baseName);
		}
	}

	@Override
	public synchronized void save() {
		initPython();
		if (pexec.isImplemented(26)) {
			pexec.execPythonVoid("save");
		} else {
			super.save();
		}
	}

	@Override
	public synchronized void load() {
		initPython();
		if (pexec.isImplemented(27)) {
			pexec.execPythonVoid("load");
		} else {
			super.load();
		}
	}

	@Override
	public XmlFile getConfigFile() {
		initPython();
		if (pexec.isImplemented(28)) {
			return (XmlFile) pexec.execPython("get_config_file");
		} else {
			return super.getConfigFile();
		}
	}

	@Override
	public PluginWrapper getPlugin() {
		initPython();
		if (pexec.isImplemented(29)) {
			return (PluginWrapper) pexec.execPython("get_plugin");
		} else {
			return super.getPlugin();
		}
	}

	@Override
	public void doHelp(StaplerRequest req, StaplerResponse rsp) throws IOException, ServletException {
		initPython();
		if (pexec.isImplemented(30)) {
			pexec.execPythonVoid("do_help", req, rsp);
		} else {
			super.doHelp(req, rsp);
		}
	}

	public boolean superHasScript() {
		return super.hasScript();
	}

	public boolean superHasStylesheet() {
		return super.hasStylesheet();
	}

	public void superDoScriptJs(StaplerRequest req, StaplerResponse rsp) throws IOException, ServletException {
		super.doScriptJs(req, rsp);
	}

	public void superDoStyleCss(StaplerRequest req, StaplerResponse rsp) throws IOException, ServletException {
		super.doStyleCss(req, rsp);
	}

	public String superGetId() {
		return super.getId();
	}

	public Class<ConsoleNote<?>> superGetT() {
		return super.getT();
	}

	public String superGetDescriptorUrl() {
		return super.getDescriptorUrl();
	}

	public String superGetCheckUrl(String fieldName) {
		return super.getCheckUrl(fieldName);
	}

	public void superCalcFillSettings(String field, Map<String, Object> attributes) {
		super.calcFillSettings(field, attributes);
	}

	public void superCalcAutoCompleteSettings(String field, Map<String, Object> attributes) {
		super.calcAutoCompleteSettings(field, attributes);
	}

	public PropertyType superGetPropertyType(@Nonnull Object instance, @Nonnull String field) {
		return super.getPropertyType(instance, field);
	}

	public PropertyType superGetPropertyTypeOrDie(@Nonnull Object instance, @Nonnull String field) {
		return super.getPropertyTypeOrDie(instance, field);
	}

	public PropertyType superGetPropertyType(String field) {
		return super.getPropertyType(field);
	}

	public PropertyType superGetGlobalPropertyType(String field) {
		return super.getGlobalPropertyType(field);
	}

	public ConsoleNote<?> superNewInstance(StaplerRequest req) throws FormException {
		return super.newInstance(req);
	}

	public ConsoleNote<?> superNewInstance(StaplerRequest req, JSONObject formData) throws FormException {
		return super.newInstance(req, formData);
	}

	public Klass<?> superGetKlass() {
		return super.getKlass();
	}

	public String superGetHelpFile() {
		return super.getHelpFile();
	}

	public String superGetHelpFile(final String fieldName) {
		return super.getHelpFile(fieldName);
	}

	public String superGetHelpFile(Klass<?> clazz, String fieldName) {
		return super.getHelpFile(clazz, fieldName);
	}

	public void superAddHelpFileRedirect(String fieldName, Class<? extends Describable> owner, String fieldNameToRedirectTo) {
		super.addHelpFileRedirect(fieldName, owner, fieldNameToRedirectTo);
	}

	public boolean superConfigure(StaplerRequest req) throws FormException {
		return super.configure(req);
	}

	public boolean superConfigure(StaplerRequest req, JSONObject json) throws FormException {
		return super.configure(req, json);
	}

	public String superGetConfigPage() {
		return super.getConfigPage();
	}

	public String superGetGlobalConfigPage() {
		return super.getGlobalConfigPage();
	}

	public List<String> superGetPossibleViewNames(String baseName) {
		return super.getPossibleViewNames(baseName);
	}

	public synchronized void superSave() {
		super.save();
	}

	public synchronized void superLoad() {
		super.load();
	}

	public XmlFile superGetConfigFile() {
		return super.getConfigFile();
	}

	public PluginWrapper superGetPlugin() {
		return super.getPlugin();
	}

	public void superDoHelp(StaplerRequest req, StaplerResponse rsp) throws IOException, ServletException {
		super.doHelp(req, rsp);
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
