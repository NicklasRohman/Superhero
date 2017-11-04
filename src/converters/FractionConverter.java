package converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import backing.HeroBean;
import entites.Fraction;

@FacesConverter(forClass=Fraction.class,value="fractionConverter")
public class FractionConverter  implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		int id;
		try {
			id = Integer.parseInt(value);
		} catch (NumberFormatException e) {
			return "";
		}
		HeroBean bb = context.getApplication().evaluateExpressionGet(context, "#{heroBean}", HeroBean.class);
		
		return bb.getFractionEJB().find(id);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value == null) return "";
		if (!(value instanceof Fraction)) return "";
		
		return Integer.toString( ((Fraction) value).getFractionid());
	}
}