package sample.apt;

import java.util.*;
import org.apache.velocity.VelocityContext;
import java.lang.annotation.Annotation;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.TypeElement;

import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;

import org.kotemaru.apthelper.*;
import org.kotemaru.apthelper.annotation.*;

@SupportedSourceVersion(SourceVersion.RELEASE_6)
@SupportedAnnotationTypes("sample.annotation.JavaScriptStub")
public class JavaScriptStubAp extends ClassProcessorBase
{
	public JavaScriptStubAp() {
	}
	
	@Override
	public boolean processClass(TypeElement classDecl) throws Exception {
		Class<?> annoClass = sample.annotation.JavaScriptStub.class;
		return processClass(classDecl, annoClass);
	}
	
	private final static Set<String> OPTIONS = new HashSet<String>();
	static {
	};
	@Override
	public Set<String> getSupportedOptions() {
		return OPTIONS;
	}
}
