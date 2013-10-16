package sample.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import org.kotemaru.apthelper.annotation.ProcessorGenerate;
import sample.apt.TraceDelegateHelper;


/**
 * コード生成をする注釈処理クラスが自動で生成される注釈の定義。
 * <br>- 生成内容の実体は TraceDelegate.vm にある。
 * @author kotemaru.org
 */

//注釈処理を生成する為の注釈。
@ProcessorGenerate(
	template="TraceDelegate.vm",      // Velocityのテンプレートファイル名。
	path=".",                         // 出力先パッケージへの相対パス。
	suffix="Trace",                   // 出力クラス名に追加する文字列。
	helper=TraceDelegateHelper.class, // Velocityに $helper で渡されるクラス
	isResource=false,                 // 出力がリソースファイルの場合true
	options={}                        // -A オプションを受け取る場合、オプション名。
)

//通常の注釈宣言。@TargetがTYPEが必須。
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface TraceDelegate {
}
