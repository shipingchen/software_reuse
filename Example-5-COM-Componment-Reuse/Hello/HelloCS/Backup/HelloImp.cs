using System;
using System.EnterpriseServices;
using System.Runtime.InteropServices;
using System.Windows.Forms;


[assembly:ApplicationActivation(ActivationOption.Server)]
[assembly:ApplicationName("MyApp")]
[assembly:ApplicationAccessControl(false)]
[assembly: CLSCompliant(true)]


namespace HelloCS
{
	/// <summary>
	/// 
	/// </summary>
	/// 

	// [Transaction(TransactionOption.Required)]
	// [JustInTimeActivation]
	[ClassInterface(ClassInterfaceType.AutoDispatch)]
	// [EventTrackingEnabled]
	// [ObjectPooling]
	public class HelloImp: ServicedComponent, IHello
	{
		string name;

		public string HelloWorld(string name)			
		{
			this.name = name;
			string msg = "Hello " + name + " ! ";
			MessageBox.Show(msg);

			return msg;
		}
	}
}
