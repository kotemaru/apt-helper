package sample.apt;

import org.kotemaru.apthelper.AptUtil;

import sample.annotation.TraceOption;

import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;


/**
 * TraceDelegate.vm に ${helper} として渡されるクラス。
 * @author kotemaru.org
 */

public class TraceDelegateHelper extends AptUtil {

	/**
	 * コンストラクタ。
	 * @param classDecl 注釈 @TraceDelegate が宣言されたクラスの要素。
	 * @param env 注釈処理の実行環境。
	 */
	public TraceDelegateHelper(TypeElement classDecl, ProcessingEnvironment env) {
	}
	
	/**
	 * メソッドに @TraceOption(errorStack=true) が指定されているか否かを返す。
	 * @param method メソッド要素
	 * @return true=指定されている。
	 */
	public boolean isErrorStack(ExecutableElement method) {
		TraceOption anno = method.getAnnotation(TraceOption.class);
		if (anno == null) return false; // 注釈が無いとnullが戻る。
		return anno.errorStack();
	}
}

