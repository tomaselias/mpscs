package CsBaseLanguage.tests.EditorAndStructure;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseEditorTestBody;
import jetbrains.mps.lang.test.runtime.TransformationTest;

@MPSLaunch
public class StructDeclaration_CtorStatic_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(StructDeclaration_CtorStatic_Test.class, "${project_home}", "r:fcdf8a98-8638-4be9-822b-7c6b6a82fdf7(CsBaseLanguage.tests.EditorAndStructure@tests)", false);

  public StructDeclaration_CtorStatic_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_StructDeclaration_CtorStatic() throws Throwable {
    new TestBody(this).testMethod();
  }

  /*package*/ static class TestBody extends BaseEditorTestBody {

    /*package*/ TestBody(TransformationTest owner) {
      super(owner);
    }

    @Override
    public void testMethodImpl() throws Exception {
      initEditorComponent("3984630545209928539", "3984630545209928535");
      typeString("static");
      invokeAction("jetbrains.mps.ide.editor.actions.Complete_Action");

    }
  }
}